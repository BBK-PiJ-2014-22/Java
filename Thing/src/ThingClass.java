import java.util.Scanner;

public class ThingClass {

	private String name;
	private int number;
	private int[] favoritynumbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] getFavoritynumbers() {
		return favoritynumbers;
	}

	public void setFavoritynumbers(int[] favoritynumbers) {
		this.favoritynumbers = favoritynumbers;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return "ThingClass [name=" + name + ", number=" + number + "]";
	}

}
