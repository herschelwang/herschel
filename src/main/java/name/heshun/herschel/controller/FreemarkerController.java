package name.heshun.herschel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: heshun
 * @date: 2018/3/16
 * @content:
 */
@Controller
@RequestMapping(value = "/freemarker")
public class FreemarkerController {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView hello(Model model, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        model.addAttribute("msg", "Hello Freemarker");
        mv.addObject(model);
        mv.setViewName("hello");
        return mv;
    }
}
