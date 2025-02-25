class SmartHome{
    public final static class Device{
        private final int id;
        private final String name;
        public static final int MAX_DEVICES=50;
        public Device(int id,String name)
        {
            this.id=id;
            this.name=name;
        }
        public final String getDeviceInfo(){
            return "Device ID: " + id + ",Device Name: " + name;
        }
    }
    public final static class Configuration{
        public static final int MAX_POWER_LIMIT=5000;
    }
    public abstract static class DeviceType{
        public abstract String getDeviceCategory();
    }
    public static class LightDevice extends DeviceType{
        public String getDeviceCategory(){
            return "Lighting Device";
        }
    }
    public static class FanDevice extends DeviceType{
        public String getDeviceCategory(){
            return "Fan Device";
        }
}
public static void main(String t[])
{
    Device d=new Device(1,"Smart Bulb");
    System.out.println(d.getDeviceInfo());
    
    System.out.println("Max Power Limit : " + Configuration.MAX_POWER_LIMIT);
    
    DeviceType Light=new LightDevice();
    DeviceType Fan=new FanDevice();
    System.out.println("Light Device Category : "+ Light.getDeviceCategory());
    System.out.println("Fan Device Category :" + Fan.getDeviceCategory());
}
}
