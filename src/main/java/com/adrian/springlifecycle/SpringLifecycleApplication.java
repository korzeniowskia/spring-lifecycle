package com.adrian.springlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLifecycleApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(AppConfiguration.class);
    context.refresh();

    LibraryManager manager = context.getBean(LibraryManager.class);
    context.close();
  }

}
