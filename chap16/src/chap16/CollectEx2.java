package chap16;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student3{
	String name;
	boolean isMale;
	int grade;
	int ban;
	int score;
	Student3(String name,boolean isMale, int grade,int ban,int score){
		this.name=name;
		this.isMale=isMale;
		this.grade=grade;
		this.ban=ban;
		this.score=score;
	}
	//getter
	String getName() {return name;}
	boolean isMale() {return isMale;}
	int getGrade() {return grade;}
	int getBan() {return ban;}
	int getScore() {return score;}
	public String toString() {
		return String.format("[%s,%s,%d�г�,%d��,%3d��]",name
				,isMale?"��":"��",grade,ban,score);
	}
	enum Level{ //������
		HIGH,MID,LOW
	}
}
public class CollectEx2 {
	public static void main(String[] args) {
		Student3[] stuArr = {
				new Student3("���ڹ�",true,1,1,300),
				new Student3("���ڹ�",false,1,1,250),
				new Student3("��ȫ��",false,1,2,200),
				new Student3("��ȫ��",true,1,2,150),
				new Student3("��ȣ��",true,2,1,300),
				new Student3("��â��",false,2,1,250),
				new Student3("���",false,2,2,200),
				new Student3("���̸�",true,2,2,150),
				new Student3("�����",false,2,3,300),
				new Student3("������",true,2,3,270),
		};
		System.out.println("1. ������ ����");
		//partitioningBy(Student3::isMale) :
		//							return���� boolean
		Map<Boolean,List<Student3>> stuByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale));
		System.out.println("����:");
//		List<Student3> maleList = stuByGender.get(true);
//		for(Student3 s : maleList) {
//			System.out.println(s);
//		}
		for(Student3 s : stuByGender.get(true)) {
			System.out.println(s);
		}
		System.out.println("����:");
		for(Student3 s : stuByGender.get(false)) {
			System.out.println(s);
		}
		
		System.out.println("1. ������ ����+ �����л���");
		Map<Boolean,Long> stuNumByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale
						,Collectors.counting()));
		System.out.println("���л���:"+stuNumByGender.get(true));		
		System.out.println("���л���:"+stuNumByGender.get(false));
		
		System.out.println("1. ������ ����+ ����1��");
		Map<Boolean,Optional<Student3>> stuScoreByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale,
						Collectors.maxBy //���� ū ��ü ����
						(Comparator.comparingInt(Student3::getScore))));
		System.out.println("���л�1��:"+stuScoreByGender.get(true).get());		
		System.out.println("���л�1��:"+stuScoreByGender.get(false).get());
		
	}
}
