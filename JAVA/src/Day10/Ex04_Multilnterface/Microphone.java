package Day10.Ex04_Multilnterface;

public interface Microphone {

	int inputVolumeMax = 50;	//음성 인식 최대 볼륨
	int intputVolumeMin = 5;	//음성 인식 최소 볼륨
	
	//음성 인식
	String receiveVoice(String voice);
}
