/**
 *
 * Copyright (c) 2009-2013 Freedomotic team http://freedomotic.com
 *
 * This file is part of Freedomotic
 *
 * This Program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 *
 * This Program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Freedomotic; see the file COPYING. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.freedomotic.environment;

import com.freedomotic.exceptions.DaoLayerException;

import com.freedomotic.model.environment.Environment;

import java.io.File;
import java.util.Collection;

/**
 *
 * @author enrico
 */
public interface EnvironmentDAO {

    void save(Environment environment) throws DaoLayerException;

    void delete(Environment environment) throws DaoLayerException;

    Collection<Environment> load() throws DaoLayerException;
}