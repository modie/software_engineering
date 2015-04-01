package pcparts;

public abstract class pcParts {
	private String name ;
	private int Id ;
	private float price ;
	private byte category ;
	private String pic ;
	public String getPic()
	{
		return pic;
	}
	public void setPic(String pic)
	{
		this.pic = pic;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return Id;
	}
	public void setId(int id)
	{
		Id = id;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public byte getCategory()
	{
		return category;
	}
	public void setCategory(byte category)
	{
		this.category = category;
	}
	
	

}
