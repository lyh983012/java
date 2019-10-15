package problem1;

class Fraction {

	private long dad;
	private boolean isint=false;

	public long son;
	public long mom;
	public long ease() {

		long temp=1;
		long son1=son;
		long mom1=mom;
		if (son1 % mom1==0) {
			dad=son1/mom1;
			isint=true;
			return -1;
		}
		while(temp!=0) {
			if (son1>mom1) {
				son1=son1%mom1;
				temp=son1;
			}else {
				mom1=mom1%son1;
				temp=mom1;
			}	
			//System.out.println(mom1+" "+son1);
		}	
		if (mom1==0)
		{
			mom/=son1;
			son/=son1;
			return son1;
		}else {
			mom/=mom1;
			son/=mom1;
			return mom1;
		}
		
	}
	public long ease(long son1,long mom1) {
		long temp=1;
		while(temp!=0) {
			if (son1>mom1) {
				son1=son1%mom1;
				temp=son1;
			}else {
				mom1=mom1%son1;
				temp=mom1;
			}	
			//System.out.println(mom1+" "+son1);
		}	
		if (mom1==0)
		{
			return son1;
		}else {
			return mom1;
		}
	}
		
	public void True() {
		if (son>mom) {
			isint=true;
			son=son/mom;
		}
	}
	public Fraction(long son1, long mom1) {
	this.son=son1;
	this.mom=mom1;
	}
	public String toString(){

		if (isint) {
			return dad+"";
		}else{
			return son+"/"+mom+"";
		}
	}

	public void add (Fraction fra) {
		long common=ease(fra.mom,this.mom);
		long common_mom=(fra.mom/common)*this.mom;
		long common_son=	(fra.mom/common)*this.son+(this.mom/common)*fra.son;
		this.mom=common_mom;
		this.son=common_son;
	}
	public Fraction add ( Fraction fra1, Fraction fra2) {
		long common=ease(fra1.mom,fra2.mom);
		long common_mom=(fra1.mom/common)*fra2.mom;
		long common_son=	(fra1.mom/common)*fra2.son+(fra2.mom/common)*fra1.son;
		Fraction temp=new Fraction (common_son,common_mom);
		return temp;
	}

	public void minus(Fraction fra)
	{
	long common=ease(fra.mom,this.mom);
	long common_mom=(fra.mom/common)*this.mom;
	long common_son=	(fra.mom/common)*this.son-(this.mom/common)*fra.son;
	this.mom=common_mom;
	this.son=common_son;
	}
	public Fraction minus (final Fraction fra2,final Fraction fra1) {
		long common=ease(fra1.mom,fra2.mom);
		long common_mom=(fra1.mom/common)*fra2.mom;
		long common_son=	(fra1.mom/common)*fra2.son-(fra2.mom/common)*fra1.son;
		Fraction temp=new Fraction (common_son,common_mom);
		return temp;
	}

	public void time (Fraction fra) {
		long common=ease(fra.mom,this.mom);
		long common_mom=(fra.mom/common)*this.mom;
		long common_son=	this.son*(fra.son/common);
		this.mom=common_mom;
		this.son=common_son;
	}
	public Fraction time (final Fraction fra1,final Fraction fra2) {
		long common=ease(fra1.mom,fra2.mom);
		long common_mom=(fra1.mom/common)*fra2.mom;
		long common_son=	fra2.son*(fra1.son/common);
		Fraction temp=new Fraction (common_son,common_mom);
		return temp;
	}

	public void divide (Fraction fra) {
		long common=ease(fra.son,this.mom);
		long common_mom=(fra.son/common)*this.mom;
		long common_son=	this.son*(fra.mom/common);
		this.mom=common_mom;
		this.son=common_son;
	}
	public Fraction divide(Fraction fra1, Fraction fra2) {
		long common=ease(fra1.mom,fra2.son);
		long common_mom=(fra1.mom/common)*fra2.son;
		long common_son=	fra1.son*(fra2.mom/common);
		Fraction temp=new Fraction (common_son,common_mom);
		return temp;
	}

}

	
