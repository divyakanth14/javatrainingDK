class Puchhakai
{
	public static void main(String[] args)
	{
		long account=24545734672749l;
		float salary=12.4666736f;
		float tax=99.4678876445f;
		float grossSalary=(salary+tax);
		byte age=25;
		String bankName="HDFC";
		char gender='M';
		String status="Single";
		//boolean statement=true;
		byte cmpnyage=45;
		boolean joincriteria=cmpnyage>age;
		System.out.println(cmpnyage>age);
		if(joincriteria=true){
			System.out.println("candidate is a trusted knowlee");
		}else{
			System.out.println("Candidate is not a trusted knowlee");
		}
		System.out.println("My name is Divyakanth");
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Marritual Status: "+status);
		System.out.println("Total CTC: "+grossSalary);
		System.out.println("Account number: "+account);
		System.out.println("Bank name: "+bankName);
		System.out.println("Account number "+account+" is in bank: "+bankName);
	}
	
}