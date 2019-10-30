package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Commodity {

	private String name;
	private double length;
	private double width;
	private double weight;
	
	ArrayList<Commodity> list = new ArrayList<>();

	public Commodity(String name, int length, int width, double weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	public void addProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the product: ");
		String name = scanner.nextLine();
		System.out.println("Enter length: ");
		int length = scanner.nextInt();
		System.out.println("Enter width: ");
		int width = scanner.nextInt();
		System.out.println("Enter wight: ");
		double weight = scanner.nextDouble();
		list.add(new Commodity(name, length, width, weight));
	}

	public void deleteProduct() {
		boolean isDeleted = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the product: ");
		String str = scanner.nextLine();

		Iterator<Commodity> iterator = list.iterator();
		while (iterator.hasNext()) {
			Commodity next = iterator.next();

			if (next.getName().equals(str)) {
				iterator.remove();
				isDeleted = true;
			}

		}
		if (isDeleted == false) {
			System.out.println("Sorry, but there is no such product");
		}
	}

	public void changeProduct() {
		boolean isChanged = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the product: ");
		String str = scanner.nextLine();

		Iterator<Commodity> iterator = list.iterator();
		while (iterator.hasNext()) {
			Commodity next = iterator.next();

			if (next.getName().equals(str)) {
				System.out.println("Enter the name of the product: ");
				String name = scanner.nextLine();
				next.setName(name);
				System.out.println("Enter length: ");
				int length = scanner.nextInt();
				next.setLength(length);
				System.out.println("Enter width: ");
				int width = scanner.nextInt();
				next.setWidth(width);
				System.out.println("Enter weight: ");
				double weight = scanner.nextDouble();
				next.setWeight(weight);
				isChanged = true;
			}

		}
		if (isChanged == false) {
			System.out.println("Sorry, but there is no such product");
		}

	}

	public void sortByName() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new NameComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void sortByLength() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new LengthComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void sortByWidth() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new WidthComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void sortByWeight() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new WeightComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void consoleElement() {
		System.out.println("Enter the index number of product: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (list.size() < num - 1) {
			System.out.println("Sorry, but there is no such index number");
		} else {
			System.out.println(list.get(num));
		}
	}

	public void printList() {
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
	}

}
