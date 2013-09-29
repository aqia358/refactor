package test;

import refactor.Person;

public class test {
	byte[] revBuf = new byte[21];
	byte[] sendGpsBuf = new byte[21];
	
	public boolean isEqual(byte[] a,byte[] b){
		revBuf[0] = 11;
		sendGpsBuf[0] = 11;
		if(revBuf[0] == sendGpsBuf[0]){
			System.out.println("equals");
		}else{
			System.out.println("fail");
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		t.revBuf[0] = 11;
		t.sendGpsBuf[0] = 11;
		t.isEqual(t.sendGpsBuf,t.revBuf);
	}
}
