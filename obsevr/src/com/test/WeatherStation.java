package com.test;
 
import java.util.Observable;
import java.util.Observer;
 
public class WeatherStation {
 
	public static void main(String[] args) {
		/*����Դ�͹۲��߶�Ҫά��һ�� �н��ɫWeatherData*/
		WeatherData weatherdata = new WeatherData();
		
		/*����Ϊ�������ö�����3���۲��ߣ���������Դ������*/
		ConditionDisplay cd1 = new ConditionDisplay(weatherdata,"�۲�վ1");
		
		/*����Դ������ݣ�������WeatherData�ķ���������WeatherData д����*/
		weatherdata.setMeasurements(10.5, 10.4, 10.8);
	}
}