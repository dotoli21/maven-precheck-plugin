/**
 * Copyright (C) 2010  Jaehyeon Nam (dotoli21@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.openwebtop.maven.plugins.precheck.common;

import org.codehaus.plexus.util.DirectoryScanner;
import org.openwebtop.maven.plugins.precheck.common.model.DefaultDirectoryScannerConfiguration;

/**
 * Default directory scanner
 *
 * @author Jaehyeon Nam (dotoli21@gmail.com)
 * @since 2010. 10. 26.
 */
public class DefaultDirectoryScanner {

	public String[] getIncludedFiles(DefaultDirectoryScannerConfiguration defaultDirectoryScannerConfiguration) throws Exception {
		final DirectoryScanner directoryScanner = new DirectoryScanner();
		directoryScanner.setBasedir(defaultDirectoryScannerConfiguration.getBasedir());
		directoryScanner.setIncludes(defaultDirectoryScannerConfiguration.getIncludes());
		directoryScanner.setExcludes(defaultDirectoryScannerConfiguration.getExcludes());

		try {
			directoryScanner.scan();
		} catch (IllegalStateException e) {
			throw new Exception(e);
		}

		return directoryScanner.getIncludedFiles();
	}

}
