package testdwr;

import java.util.Collection;

import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;

/**
 * 客户端推送消息
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
