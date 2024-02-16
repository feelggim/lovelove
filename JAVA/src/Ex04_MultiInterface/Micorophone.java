package Ex04_MultiInterface;

public interface Micorophone {
	
	int inputVolumeMAx = 50; 	//음성 인식 최대 볼륨
	int inputVolumeMin = 5;		//음성 인식 최소 볼륨
	
	// 음성 인식
	String receivevoice(String voice);

	int channelsearch(String keyword);

}
