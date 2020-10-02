package com.sky.guide;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 【题目】猫狗队列
 * @author SKY
 *
 */
public class DogCatQueue {
	private Queue<PetEnterQueue> dogQ;
	private Queue<PetEnterQueue> catQ;
	private long count;
	
	public DogCatQueue() {
		this.dogQ = new LinkedList<>();
		this.catQ = new LinkedList<>();
		this.count = 0;
	}
	
	public void add(Pet pet) {
		if (pet.getType().equals("dog")) {
			this.dogQ.add(new PetEnterQueue(pet, this.count++));
		} else if (pet.getType().equals("cat")) {
			this.catQ.add(new PetEnterQueue(pet, this.count++));
		} else {
			throw new RuntimeException("err, not dog or cat");
		}
	}
	
	public Pet pollAll() {
		if (!dogQ.isEmpty() && !catQ.isEmpty()) {
			if (dogQ.peek().getCount() < catQ.peek().getCount()) {
				return dogQ.poll().getPet();
			} else {
				return catQ.poll().getPet();
			}
		} else if (!dogQ.isEmpty()) {
			return dogQ.poll().getPet();
		} else if (!catQ.isEmpty()) {
			return catQ.poll().getPet();
		} else {
			throw new RuntimeException("err, queue is empty!");
		}
	}
	
	public Dog pollDog() {
		if (!dogQ.isEmpty()) {
			return (Dog) dogQ.poll().getPet();
		} else {
			throw new RuntimeException("Dog queue is empty!");
		}
	}
	
	public Cat pollCat() {
		if (!catQ.isEmpty()) {
			return (Cat) catQ.poll().getPet();
		} else {
			throw new RuntimeException("Cat queue is empty!");
		}
	}
}

class Pet {
	private String type;
	
	public Pet(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

class Dog extends Pet {

	public Dog(String type) {
		super(type);
	}
	
}

class Cat extends Pet {

	public Cat(String type) {
		super(type);
	}
	
}


class PetEnterQueue {
	private Pet pet;
	private long count;
	
	public PetEnterQueue(Pet pet, long count) {
		this.pet = pet;
		this.count = count;
	}

	public Pet getPet() {
		return pet;
	}

	public long getCount() {
		return count;
	}
	
	public String getEnterPetType() {
		return this.pet.getType();
	}
}


