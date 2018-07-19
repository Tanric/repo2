package com.del;
//Design pattern called Factory pattern
public class MovableFactory {

	public static Movable getInstance(String type) {
		if("car".equals(type)) {
			return new Car();
		}
		// TODO Auto-generated method stub
		else if("bus".equals(type)) {
			return new Bus();
		}
		return new Movable() {

			@Override
			public void move() {
				// TODO Auto-generated method stub
				System.out.println("anon vehicle is moving");
			}
		};
	}
	
	private static class Unknown implements Movable{
		@Override
		public void move() {
			System.out.println("unknown vehicle moves");
		}
	}

}
