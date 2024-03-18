package in.Raju.it.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import in.Raju.it.entity.Iamage;
import in.Raju.it.service.ImageService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class IamageController {

	@Autowired
	private ImageService imageService;

	@GetMapping("/hello")
	@ResponseBody
	public String helloworld() {
		return "Hello world";
	}

	// display Image
	@GetMapping("/display")
	public ResponseEntity<byte[]> displayImage(@RequestParam("id") Long id) throws IOException, SQLException {
		Iamage im = imageService.viewById(id);
		byte[] iamagebyte = null;
		iamagebyte = im.getImage().getBytes(1, (int) im.getImage().length());
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(iamagebyte);
	}

	// view All images
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		List<Iamage> imageList = imageService.viewAll();
		mv.addObject("imageList", imageList);
		return mv;
	}
	
	 // add image - get
    @GetMapping("/add")
    public ModelAndView addImage(){
        return new ModelAndView("addimage");
    }
    
    // add image - post
    @PostMapping("/add")
    public String addImagePost(HttpServletRequest request,@RequestParam("image") MultipartFile file) throws IOException, SerialException, SQLException
    {
        byte[] bytes = file.getBytes();
        SerialBlob blob = new javax.sql.rowset.serial.SerialBlob(bytes);

        Iamage image = new Iamage();
        image.setImage(blob);
        imageService.create(image);
        return "redirect:/";
    }

}
