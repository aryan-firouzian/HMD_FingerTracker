/*
 * Author: Jari Tervonen <jjtervonen@gmail.com> 2013-
 *
 */

package uni.oulu.fingertracker.communicator;

public interface HmdCommunicator{

	public boolean sendData(String data);
	public boolean sendData(int data);
	public boolean sendData(byte data);
	public boolean sendData(long data);
	
	public boolean isConnected();
	
	public void doStart();
	public void doPause();
	public void doStop();
	public void doResume();
}
