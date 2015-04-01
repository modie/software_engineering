package pcparts;

public class cpu extends pcParts
{
	private byte category = 0 ;
	private String brand ;
	private String socket ;
	private byte numberOfCores ;
	private float speed ;
	private float cacheMemory ;
	private boolean fanIncluded ;
	private boolean gpuIncluded ;
	
	public cpu()
	{
		setCategory( category );
	}
	
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getSocket()
	{
		return socket;
	}
	public void setSocket(String socket)
	{
		this.socket = socket;
	}
	public byte getNumberOfCores()
	{
		return numberOfCores;
	}
	public void setNumberOfCores(byte numberOfCores)
	{
		this.numberOfCores = numberOfCores;
	}
	public float getSpeed()
	{
		return speed;
	}
	public void setSpeed(float speed)
	{
		this.speed = speed;
	}
	public float getCacheMemory()
	{
		return cacheMemory;
	}
	public void setCacheMemory(float cacheMemory)
	{
		this.cacheMemory = cacheMemory;
	}
	public boolean isFanIncluded()
	{
		return fanIncluded;
	}
	public void setFanIncluded(boolean fanIncluded)
	{
		this.fanIncluded = fanIncluded;
	}
	public boolean isGpuIncluded()
	{
		return gpuIncluded;
	}
	public void setGpuIncluded(boolean gpuIncluded)
	{
		this.gpuIncluded = gpuIncluded;
	}
	
	
}
