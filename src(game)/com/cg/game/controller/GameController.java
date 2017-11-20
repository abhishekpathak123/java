package com.cg.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.game.bean.Game;
import com.cg.game.bean.Users;
import com.cg.game.service.IGameService;

@Controller
public class GameController {
	static int gamePrice;
	@Autowired
	private IGameService gameService;

	public IGameService getGameService() {
		return gameService;
	}

	public void setGameService(IGameService gameService) {
		this.gameService = gameService;
	}

	@RequestMapping("/showHomePage")
	public String showHomePage() {
		return "index";
	}

	@RequestMapping("/viewGame")
	public ModelAndView showViewAllGames() {

		ModelAndView mv = new ModelAndView();

		List<Game> list = gameService.gameList();
		if (list.isEmpty()) {
			String msg = "There are no Games";
			mv.setViewName("myError");
			mv.addObject("msg", msg);
		} else {
			mv.setViewName("viewAllGamesList");
			// Add the attribute to the model
			mv.addObject("list", list);
		}
		return mv;
	}

	@RequestMapping("/showUserDetailsForm")
	public ModelAndView showViewDonationForm() {

		// Create an attribute of type Question
		Users user = new Users();
		// Add the attribute to the model and return along with
		// the view name
		ModelAndView mv = new ModelAndView("viewUsers");
		mv.addObject("user", user);

		return mv;
	}

	@RequestMapping("/UserIdGameForm")
	public ModelAndView showUserId(@ModelAttribute("game") Game game) {
		// Create an attribute of type Question
		gamePrice = game.getPrice();
		Users users = new Users();
		// Add the attribute to the model and set the viewname and return it

		return new ModelAndView("getUserId", "users", users);
	}

	@RequestMapping("/Play.obj")
	public ModelAndView showUserBalance(@ModelAttribute("users") Users users) {
		// Create an attribute of type Question

		Users user1 = gameService.getUser(users.getUserId());
		if (user1.getUserBalance() < gamePrice) {
			String msg = "You cannot Play a Game!!";

			// model.addAttribute("msg",msg);
			return new ModelAndView("myError", "msg", msg);
		} else {

			int result = gameService.updateBalance(users.getUserId(),
					user1.getUserBalance() - gamePrice);
		
			return new ModelAndView("updateSuccess", "balance", user1.getUserBalance() - gamePrice);
		}

	}

	@RequestMapping("/viewUsers")
	public ModelAndView viewUsers(@ModelAttribute("user") Users user) {

		ModelAndView mv = new ModelAndView();

		Users user1 = new Users();

		user1 = gameService.getUser(user.getUserId());

		if (user1 != null) {
			mv.addObject("isFirst", "true");
			mv.setViewName("viewUsers");
			mv.addObject("user1", user1);
		} else {
			String msg = "Enter a Valid Id!!";
			mv.setViewName("myError");
			mv.addObject("msg", msg);
		}

		return mv;
	}

}
