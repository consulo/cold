package consulo.cold;

import com.intellij.openapi.diagnostic.DefaultLogger;
import com.intellij.openapi.diagnostic.Logger;

/**
 * @author VISTALL
 * @since 12.04.2016
 */
public class ColdLoggerFactory implements Logger.Factory
{
	@Override
	public Logger getLoggerInstance(String s)
	{
		return new DefaultLogger(s)
		{
			@Override
			public void info(String message)
			{
				System.out.println(message);
			}
		};
	}
}
