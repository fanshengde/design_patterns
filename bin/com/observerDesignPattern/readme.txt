定义：
	观察者模式：定义了对象之间的一对多依赖，这样依赖，当一个对象改变对象状态时，他所有依赖者都会收到通知并自动更新。

例子说明：
	subject							observer
	主题对象	|------------------------>狗对象
			|------------------------>猫对象
			|------------------------>鼠对象
			|            X           >鸭对象
			
	主题对象：
		主题对象管理某些数据
		当主题对象（Subject）内数据改变，就会以特定的方式通知观察者。
		
	观察这对象：
		观察者（订阅或注册）当主题数据发生改变的时能收到更新。
		为注册（观察者）不会接受到数据。比如鸭子对象