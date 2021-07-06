package com.mitocode.tema4.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsTester {

	   public static void addCat(List<? super Cat> catList) {
//		   System.out.println(catList.get(0).getClass());
	      catList.add(new RedCat());
	      System.out.println("Cat Added");
	   }

	   public static void main(String[] args) {
	      List<Animal> animalList= new ArrayList<Animal>();
	      List<Cat> catList= new ArrayList<Cat>();
	      List<RedCat> redCatList= new ArrayList<RedCat>();
	      List<Dog> dogList= new ArrayList<Dog>();

	      //add list of super class Animal of Cat class
	      animalList.add(new Animal());
//	       addCat(animalList);

	      //add list of Cat class
	      addCat(catList);

	      //compile time error
	      //can not add list of subclass RedCat of Cat class
//	      addCat(redCatList);

	      //compile time error
	      //can not add list of subclass Dog of Superclass Animal of Cat class
//	      addCat(dogList); 
	   }
	}
	class Animal {}

	class Cat extends Animal {}

	class RedCat extends Cat {}

	class Dog extends Animal {}
