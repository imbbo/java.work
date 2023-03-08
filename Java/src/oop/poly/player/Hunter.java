package oop.poly.player;

public class Hunter extends Player{
	String pet;
	
	Hunter(String name) {
		super(name);
		pet = "멍멍이";
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("#펫 이름: " + pet);
	}

}




/*
public -> everywhere(o)
class (o)
constructor(o)
method (o)
field(o)
--------------------------------------------
protected -> similar to default
			inherit -> diff pac(o)
class(x)
constructor(o)
method(o)
field(o
--------------------------------------------
default -> same package (o)
		   different pac -> (x)
class(o)
constructor(o)
method(o)
field(o
----------------------------------------------
private -> same class (o)
etc -> (x)
class(x)
constructor(o)
method(o)
field(o
*/