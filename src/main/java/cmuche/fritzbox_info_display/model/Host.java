package cmuche.fritzbox_info_display.model;

import cmuche.fritzbox_info_display.enums.HostInterface;

public class Host
{
  private String name;
  private String ip;
  private String mac;
  private HostInterface iface;

  public Host(String name, String ip, String mac, HostInterface iface)
  {
    this.name = name;
    this.ip = ip;
    this.mac = mac;
    this.iface = iface;
  }

  @Override
  public String toString()
  {
    return name + " @" + ip + " (" + iface.getId() + ")";
  }

  public String getName()
  {
    return name;
  }

  public String getIp()
  {
    return ip;
  }

  public String getMac()
  {
    return mac;
  }

  public HostInterface getIface()
  {
    return iface;
  }
}
