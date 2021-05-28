package com.test;
 
import java.util.Observable;
import java.util.Observer;
 
public class ConditionDisplay implements Observer,DisplayElement{
	private double temperature;
	private double humidity;
	private double pressure;
	private Observable observable;		//	�κ�����Դ������
	
	/*�������۲���ʱ������ָ���� ����Դ*/
	public ConditionDisplay(Observable observable,String name) {
		this.observable = observable;
		observable.addObserver(this);	//ע��
	}
 
	public void display() {
		System.out.println("temperature:"+temperature+"  humidity:"+humidity+"  pressure:"+pressure);
	}
 
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData w = (WeatherData)o;
			this.temperature = w.getTemperature();
			this.humidity = w.getHumidity();
			this.pressure = w.getPressure();
			display();
		}	
	}
}