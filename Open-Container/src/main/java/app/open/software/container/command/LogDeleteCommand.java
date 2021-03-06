package app.open.software.container.command;

import app.open.software.core.command.Command;
import app.open.software.core.command.CommandHelper;
import app.open.software.core.logger.Logger;

/**
 * Implementation of the {@link Command} interface to delete the log files
 *
 * @author Tammo0987
 * @version 1.0
 * @since 0.1
 */
@Command.Info(names = "log", description = "Deletes the log files")
public class LogDeleteCommand implements Command {

	/**
	 * {@inheritDoc}
	 */
	public boolean execute(final String[] args) {
		if (args.length == 1 && args[0].equals("delete")) {
			Logger.getFileHandler().deleteLogFiles();
			return true;
		}

		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public CommandHelper helper() {
		return new CommandHelper("log").addToHepList("lod delete");
	}
}
