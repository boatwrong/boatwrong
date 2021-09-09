
public class Entry 
{
	private String firstName, lastName, fullName;
	private int areaCode, prefix, personalCode, ID;
	private String phoneNumber;
	private final String DEF_NAME = "N/A";
	private final int DEF_PREFIX = 000;
	private final int DEF_AREA = 000;
	private final int DEF_PERSONAL = 0000;
	private static int IDCount= 1;
	
	
	
	public Entry()
	{
		ID = IDCount;
		IDCount++;
		firstName = DEF_NAME;
		lastName = DEF_NAME;
		areaCode = DEF_AREA;
		prefix = DEF_PREFIX;
		personalCode = DEF_PERSONAL;
		phoneNumber = String.valueOf(areaCode) + "-" + String.valueOf(prefix) + "-" + String.valueOf(personalCode);
		fullName = lastName + ", " + firstName;
	}
	
	public Entry(String firstName, String lastName, int areaCode, int prefix, int personalCode)
	{
		ID = IDCount;
		IDCount++;
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.personalCode = personalCode;
		this.firstName = firstName;
		this.lastName = lastName;
		phoneNumber = String.valueOf(areaCode) + "-" + String.valueOf(prefix) + "-" + String.valueOf(personalCode);
		fullName = lastName + ", " + firstName;
	}

}
