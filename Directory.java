
public class Directory {
	private Entry[] directory;
	
	public Directory()
	{
		this.directory = null;
	}

	public Directory(Entry[] directory)
	{
		this.directory = directory;
	}
	
	public boolean addEntry(Entry entry)
	{
		return false;
	}
	
	public boolean rmEntry(String firstName, String lastName)
	{
		return false;
	}
	
	public Entry getEntry(String firstName, String lastName)
	{
		return null;
	}
	
}
