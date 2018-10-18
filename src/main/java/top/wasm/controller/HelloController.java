package top.wasm.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloController {
    @Value("static_images_path")
    private String static_images_path;

//    @GetMapping("/images")
//    @ResponseBody
//    public String[] images(){
//
//
//        File filePath = new File(static_images_path);
//        String[] fileList = filePath.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".jpeg") || name.toLowerCase().endsWith(".png");
//            }
//        });
//
//        return fileList;
//    }
//    @GetMapping("/mp3")
//    public String[] mp4(){
//
//        File filePath = new File(static_images_path);
//        String[] fileList = filePath.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.toLowerCase().endsWith(".mp4");
//            }
//        });
//
//        return fileList;
//    }

    @GetMapping("/hello")
    @ResponseBody
    public Map test(){
        Map m = new HashMap();
        m.put("result","ok");
        return m;
    }



}
