package com.adrian.springlifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class LibraryManager implements BeanNameAware {

  private String beanName;

  @Override
  public void setBeanName(String name) {
    this.beanName = name;
    System.out.println("Name of the bean: " + beanName);
  }
}
