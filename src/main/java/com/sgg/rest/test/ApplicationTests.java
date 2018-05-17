/*package com.sgg.rest.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.sgg.rest.Application;

import freemarker.template.Template;
	
	 *	Mail Functions
	 
	@RunWith(SpringJUnit4ClassRunner.class)
	@SpringBootTest(classes = Application.class)
	public class ApplicationTests {
	@Autowired
	private JavaMailSender mailSender;
	 
	@Test
	public void sendSimpleMail() throws Exception {
	SimpleMailMessage message = new SimpleMailMessage();
	message.setFrom("1532697195@qq.com");
	message.setTo("455382077@qq.com");
	message.setSubject("主题:haha");
	message.setText("测试邮件内容6666");
	mailSender.send(message);
	}
	 
	@Test
	public void sendAttachmentsMail() {
	  MimeMessage message = null;
	  try {
	    message = mailSender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message, true);
	    helper.setFrom("1532697195@qq.com");
	    helper.setTo("455382077@qq.com");
	    helper.setSubject("主题：带附件的邮件");
	    helper.setText("带附件的邮件内容");
	    //注意项目路径问题，自动补用项目路径
	    FileSystemResource file = new FileSystemResource(new File("src/main/resources/image/WechatIMG1.jpeg"));
	    //加入邮件
	    helper.addAttachment("图片.jpeg", file);
	  } catch (Exception e){
	    e.printStackTrace();
	  }
	  mailSender.send(message);
	}
	@Test
	public void sendHtmlMail() {
	  MimeMessage message = null;
	  try {
	    message = mailSender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message, true);
	    helper.setFrom("1532697195@qq.com");
	    helper.setTo("455382077@qq.com");
	    helper.setSubject("标题：发送Html内容");
	    StringBuffer sb = new StringBuffer();
	    sb.append("<h1>大标题-h1</h1>")
	        .append("<p style='color:#F00'>红色字</p>")
	        .append("<p style='text-align:right'>右对齐</p>");
	    helper.setText(sb.toString(), true);
	  } catch (Exception e) {
	    e.printStackTrace();
	  }
	  mailSender.send(message);
	}
	@Test
	public void sendInlineMail() {
	  MimeMessage message = null;
	  try {
	    message = mailSender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message, true);
	    helper.setFrom("18852950196@163.com");
	    helper.setTo("455382077@qq.com");
	    helper.setSubject("主题：带静态资源的邮件");
	    //第二个参数指定发送的是HTML格式,同时cid:是固定的写法
	    helper.setText("<html><body>带静态资源的邮件内容 图片:<img src= 'cid:pic' /></body></html>", true);
	    FileSystemResource file = new FileSystemResource(new File("src/main/resources/image/WechatIMG1.jpeg"));
	    helper.addInline("pic",file);
	  } catch (Exception e){
	    e.printStackTrace();
	  }
	  mailSender.send(message);
	}
	@Autowired
	  private FreeMarkerConfigurer freeMarkerConfigurer; //自动注入
	 
	  @Test
	  public void sendTemplateMail(){
	    MimeMessage message = null;
	    try {
	      message = mailSender.createMimeMessage();
	      MimeMessageHelper helper = new MimeMessageHelper(message, true);
//		  helper.setFrom("18852950196@163.com");
		  helper.setFrom("1532697195@qq.com");
		  helper.setTo("455382077@qq.com");
	      helper.setSubject("主题：模板邮件");
	      Map<String, Object> model = new HashMap();
	      model.put("username", "zggdczfr");
//	      修改 application.properties 文件中的读取路径
//	      FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
//	      configurer.setTemplateLoaderPath("classpath:templates");
	      //读取 html 模板
	      Template template = freeMarkerConfigurer.getConfiguration().getTemplate("mail.html");
	      String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
	      helper.setText(html, true);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    mailSender.send(message);
	  }
}
*/