package com.test;
 
import java.util.Observable;
import java.util.Observer;
 
public class WeatherData extends Observable{
	private double temperature;
	private double humidity;
	private double pressure;
 
	public WeatherData() {}
	
	/*��۲��߷�������*/
	public void measurementsChanged() {
		setChanged();		//��۲��߷�������֮ǰ�����ȵ������
		notifyObservers();	//������ΪnotifyOberservers()���Զ����ù۲��ߵ� update()����
	}
	
	/*������Դ�յ����ݺ����ȸ����Լ������ݣ��ٰ����ݷ����۲���*/
	public void setMeasurements(double temp,double humidity,double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	/*�����ӿڸ��۲��߻�ȡ����*/
	public double getTemperature() {
		return temperature;
	}
	
 
	public double getHumidity() {
		return humidity;
	}
	
 
	public double getPressure() {
		return pressure;
	}
}