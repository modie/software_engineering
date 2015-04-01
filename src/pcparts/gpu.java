package pcparts;

public class gpu extends pcParts
{
	private byte category = 1 ;
	private String chipset ; 
	private int engineClock ;
	private boolean dx10Support ;
	private boolean dx11Support ;
	private boolean dx12Support ;
	private int memoryInterface ;
	private int memorySize ;
	private int memorySpeed ;
	private String typeOfMemory ;
	private boolean multigraphics ; // Crossfire or SLI 
	private byte outputDVInumber ;
	private byte outputHDMInumber ;
	private byte outputDisplayPortNumber ;
	private boolean avivoReady ;
	private boolean HDCPsupport ;
	private boolean HDTVready ;
	private int RAMDAC ;
	private String connection ; 

	
	
	public gpu()
	{
		setCategory(category);
	}
	
	
	
	public String getChipset()
	{
		return chipset;
	}


	public void setChipset(String chipset)
	{
		this.chipset = chipset;
	}


	public int getEngineClock()
	{
		return engineClock;
	}


	public void setEngineClock(int engineClock)
	{
		this.engineClock = engineClock;
	}


	public boolean isDx10Support()
	{
		return dx10Support;
	}


	public void setDx10Support(boolean dx10Support)
	{
		this.dx10Support = dx10Support;
	}


	public boolean isDx11Support()
	{
		return dx11Support;
	}


	public void setDx11Support(boolean dx11Support)
	{
		this.dx11Support = dx11Support;
	}


	public boolean isDx12Support()
	{
		return dx12Support;
	}


	public void setDx12Support(boolean dx12Support)
	{
		this.dx12Support = dx12Support;
	}


	public int getMemoryInterface()
	{
		return memoryInterface;
	}


	public void setMemoryInterface(int memoryInterface)
	{
		this.memoryInterface = memoryInterface;
	}


	public int getMemorySize()
	{
		return memorySize;
	}


	public void setMemorySize(int memorySize)
	{
		this.memorySize = memorySize;
	}


	public int getMemorySpeed()
	{
		return memorySpeed;
	}


	public void setMemorySpeed(int memorySpeed)
	{
		this.memorySpeed = memorySpeed;
	}


	public String getTypeOfMemory()
	{
		return typeOfMemory;
	}


	public void setTypeOfMemory(String typeOfMemory)
	{
		this.typeOfMemory = typeOfMemory;
	}


	public boolean isMultigraphics()
	{
		return multigraphics;
	}


	public void setMultigraphics(boolean multigraphics)
	{
		this.multigraphics = multigraphics;
	}


	public byte getOutputDVInumber()
	{
		return outputDVInumber;
	}


	public void setOutputDVInumber(byte outputDVInumber)
	{
		this.outputDVInumber = outputDVInumber;
	}


	public byte getOutputHDMInumber()
	{
		return outputHDMInumber;
	}


	public void setOutputHDMInumber(byte outputHDMInumber)
	{
		this.outputHDMInumber = outputHDMInumber;
	}


	public byte getOutputDisplayPortNumber()
	{
		return outputDisplayPortNumber;
	}


	public void setOutputDisplayPortNumber(byte outputDisplayPortNumber)
	{
		this.outputDisplayPortNumber = outputDisplayPortNumber;
	}


	public boolean isAvivoReady()
	{
		return avivoReady;
	}


	public void setAvivoReady(boolean avivoReady)
	{
		this.avivoReady = avivoReady;
	}


	public boolean isHDCPsupport()
	{
		return HDCPsupport;
	}


	public void setHDCPsupport(boolean hDCPsupport)
	{
		HDCPsupport = hDCPsupport;
	}


	public boolean isHDTVready()
	{
		return HDTVready;
	}


	public void setHDTVready(boolean hDTVready)
	{
		HDTVready = hDTVready;
	}


	public int getRAMDAC()
	{
		return RAMDAC;
	}


	public void setRAMDAC(int rAMDAC)
	{
		RAMDAC = rAMDAC;
	}


	public String getConnection()
	{
		return connection;
	}


	public void setConnection(String connection)
	{
		this.connection = connection;
	}


	
	

}
