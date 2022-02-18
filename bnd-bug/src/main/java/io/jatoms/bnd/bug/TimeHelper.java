
package io.jatoms.bnd.bug;

import org.quartz.CronExpression;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class TimeHelper {
    /**
     * Calculates the next execution time in UTC for a given CRON expression.
     * @param expression The CRON expression
     * @return The next time point, based on UTC time
     */
    public static String getNextExecutionTime(String expression) {
        CronExpression exp = null;
        try {
            exp = new CronExpression(expression);
            Date nextTime = exp.getNextValidTimeAfter(new Date());
            return LocalDateTime.ofInstant(nextTime.toInstant(), ZoneOffset.UTC).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        log.error("Invalid cron expression");
        return "";
    }
}
