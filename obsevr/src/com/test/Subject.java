package com.test;



public interface Subject {
	public void registerObserver(Observer o);	//����Դ�ṩ���� �� �۲�����Ҫ��ȡ����Դʱ���ô˷���ע�ᣩ
	public void removeObserver(Observer o);		//����Դ�ṩ����  ���۲��߲�����Ҫ����Դ����ʱ���˳�ע�ᣩ
	public void notifyObservers();				//����Դ��ע���ڰ������й۲��߷�������
	public void registerObserver1(ConditionDisplay o);
	public void registerObserver11(ConditionDisplay o);
	public void registerObserver(ConditionDisplay o);


}
