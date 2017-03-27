package testdwr;

import java.util.Collection;

import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;

/**
 * �ͻ���������Ϣ
 * @author Administrator
 *
 */
public class ServicePush {
	
	@SuppressWarnings("deprecation")
	public void Send(String msg){
		WebContext webContext=WebContextFactory.get();
		Collection<ScriptSession> sessions=webContext.getAllScriptSessions();
		@SuppressWarnings("deprecation")
		Util util=new Util(sessions);
		System.out.println(msg);
		util.addFunctionCall("callBack", msg);
	}
}
