package Com.Folder.Spring,New Folder,CONTROLLER,RegisterController;

import org.springframework.web.servlet.ModelAndView;

public class SavaRegisterController {
public SavaRegisterController() {
System.out.println(this.getClass().getSimpleName()+"created.....");
}
public ModelAndView savaRegistersave(SatsangRegisterDTO dto) {
	return new ModelAndView("success.jsp","dto",dto);
}
}
