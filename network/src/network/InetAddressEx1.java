package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress Ŭ����
 * 	- IP�ּ� ���� �����ϴ� Ŭ����
 * 	- ��ü�������� static �޼���
 * 	  getByName("�������̸�")
 * 	  getAllByName("�������̸�")
 * 	  getByAddress(byte[])
 * 	  getLocalHost()
 */
public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = 
				InetAddress.getByName("www.goodee.co.kr");
		System.out.println("getBaName �޼���");
		System.out.println("hostnmae:"+ip.getHostName());
		System.out.println("hostaddress:"+ip.getHostAddress());
		System.out.println("getAllByName�޼���");
		//IPv4 : 32��Ʈ -> 4����Ʈ
		//IPv4 : 128��Ʈ -> 32��Ʈ*4
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr)System.out.print(((b<0)?256+b:b)+".");
		System.out.println();
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		for(InetAddress a : ips) {
			System.out.println("IP�ּ�:"+a);
		}
		System.out.println("getByAddress �޼���ȣ��");
		InetAddress ip2 = InetAddress.getByAddress(ipAddr);
		System.out.println(ip2);
		
		System.out.println("getLocalHost �޼���ȣ��");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("����ǻ��:"+local);
	}

}
