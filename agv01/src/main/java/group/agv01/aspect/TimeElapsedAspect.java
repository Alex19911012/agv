package group.agv01.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component //@Component，@Controller ,@Service,@Repository
public class TimeElapsedAspect {
	
	//切面方法的名称可以自定义
	//切面方法必须添加参数ProceedingJoinPoint
	//参数对象调用proceed()相当于执行了切面对应的方法
	//@Around直接表示在切面对应的方法之前和之后都会执行某些代码
	
	@Around("execution(* group.agv01.service.impl.*.*(..))")//*返回值任何。任何类，任何方法。..代表任何参数
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		//记录时间
		long start = System.currentTimeMillis();
		
		//执行切面对应的方法
		Object result = 	pjp.proceed();
		
		//记录结束时间
		long end = System.currentTimeMillis();
		
		//计算得到耗时
		System.err.println("耗时："+(end-start));
		
		return result;
	}
	
}
