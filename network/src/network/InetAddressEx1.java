package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress 클래스
 * 	- IP주소 정보 저장하는 클래스
 * 	- 객체생성위한 static 메서드
 * 	  getByName("도메인이름")
 * 	  getAllByName("도메인이름")
 * 	  getByAddress(byte[])
 * 	  getLocalHost()
 */
public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = 
				InetAddress.getByName("www.goodee.co.kr");
		System.out.println("getBaName 메서드");
		System.out.println("hostnmae:"+ip.getHostName());
		System.out.println("hostaddress:"+ip.getHostAddress());
		System.out.println("getAllByName메서드");
		//IPv4 : 32비트 -> 4바이트
		//IPv4 : 128비트 -> 32비트*4
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr)System.out.print(((b<0)?256+b:b)+".");
		System.out.println();
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		for(InetAddress a : ips) {
			System.out.println("IP주소:"+a);
		}
		System.out.println("getByAddress 메서드호출");
		InetAddress ip2 = InetAddress.getByAddress(ipAddr);
		System.out.println(ip2);
		
		System.out.println("getLocalHost 메서드호출");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내컴퓨터:"+local);
	}

}
