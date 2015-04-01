package pcparts;

public class mobo extends pcParts
{
	private byte category = 2 ;
	private String type ;
	private String chipset ;
	private String supportedCpu ;
	private String socket ;
	private boolean multiGraphics ;
	private byte ramSlots ;
	private String ramType ;
	private int ramLowestSpeed ;
	private int ramHighestSpeed ;
	private int [] ramSpeed ;
	//TODO add a method for this one
	private int ramMaxSize ;
	private byte sata2connections ;
	private byte sata3connections ;
	private byte esataconnections ;
	private boolean raidSupport ;
	private byte pciExpressx16number ;
	private byte pciExpress1xnumber ;
	private byte usb2number ;
	private byte usb3number ;
	private boolean wifiIncluded ;
	private float sound ;
	
	private int[] ramSpeeds = {400,667,800,1066,1333,1600,1866,2000,2133,2200,2400,2600,
			2666,2800,3000,3100,3200,3300};
	
	public mobo()
	{
		setCategory(category);
	}
	
	
	
	
	
	public byte getCategory()
	{
		return category;
	}

	public void setCategory(byte category)
	{
		this.category = category;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getChipset()
	{
		return chipset;
	}

	public void setChipset(String chipset)
	{
		this.chipset = chipset;
	}

	public String getSupportedCpu()
	{
		return supportedCpu;
	}

	public void setSupportedCpu(String supportedCpu)
	{
		this.supportedCpu = supportedCpu;
	}

	public String getSocket()
	{
		return socket;
	}

	public void setSocket(String socket)
	{
		this.socket = socket;
	}

	public boolean isMultiGraphics()
	{
		return multiGraphics;
	}

	public void setMultiGraphics(boolean multiGraphics)
	{
		this.multiGraphics = multiGraphics;
	}

	public byte getRamSlots()
	{
		return ramSlots;
	}

	public void setRamSlots(byte ramSlots)
	{
		this.ramSlots = ramSlots;
	}

	public String getRamType()
	{
		return ramType;
	}

	public void setRamType(String ramType)
	{
		this.ramType = ramType;
	}

	public int getRamLowestSpeed()
	{
		return ramLowestSpeed;
	}

	public void setRamLowestSpeed(int ramLowestSpeed)
	{
		this.ramLowestSpeed = ramLowestSpeed;
	}

	public int getRamHighestSpeed()
	{
		return ramHighestSpeed;
	}

	public void setRamHighestSpeed(int ramHighestSpeed)
	{
		this.ramHighestSpeed = ramHighestSpeed;
	}

	public int getRamMaxSize()
	{
		return ramMaxSize;
	}

	public void setRamMaxSize(int ramMaxSize)
	{
		this.ramMaxSize = ramMaxSize;
	}

	public byte getSata2connections()
	{
		return sata2connections;
	}

	public void setSata2connections(byte sata2connections)
	{
		this.sata2connections = sata2connections;
	}

	public byte getSata3connections()
	{
		return sata3connections;
	}

	public void setSata3connections(byte sata3connections)
	{
		this.sata3connections = sata3connections;
	}

	public byte getEsataconnections()
	{
		return esataconnections;
	}

	public void setEsataconnections(byte esataconnections)
	{
		this.esataconnections = esataconnections;
	}

	public boolean isRaidSupport()
	{
		return raidSupport;
	}

	public void setRaidSupport(boolean raidSupport)
	{
		this.raidSupport = raidSupport;
	}

	public byte getPciExpressx16number()
	{
		return pciExpressx16number;
	}

	public void setPciExpressx16number(byte pciExpressx16number)
	{
		this.pciExpressx16number = pciExpressx16number;
	}

	public byte getPciExpress1xnumber()
	{
		return pciExpress1xnumber;
	}

	public void setPciExpress1xnumber(byte pciExpress1xnumber)
	{
		this.pciExpress1xnumber = pciExpress1xnumber;
	}

	public byte getUsb2number()
	{
		return usb2number;
	}

	public void setUsb2number(byte usb2number)
	{
		this.usb2number = usb2number;
	}

	public byte getUsb3number()
	{
		return usb3number;
	}

	public void setUsb3number(byte usb3number)
	{
		this.usb3number = usb3number;
	}

	public boolean isWifiIncluded()
	{
		return wifiIncluded;
	}

	public void setWifiIncluded(boolean wifiIncluded)
	{
		this.wifiIncluded = wifiIncluded;
	}

	public float getSound()
	{
		return sound;
	}

	public void setSound(float sound)
	{
		this.sound = sound;
	}

	

}
