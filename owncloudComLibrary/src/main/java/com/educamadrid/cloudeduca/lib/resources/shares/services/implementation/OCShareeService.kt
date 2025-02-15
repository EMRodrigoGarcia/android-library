/**
 * ownCloud Android client application
 *
 * @author David González Verdugo
 *
 * Copyright (C) 2020 ownCloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.educamadrid.cloudeduca.lib.resources.shares.services.implementation

import com.educamadrid.cloudeduca.lib.common.OwnCloudClient
import com.educamadrid.cloudeduca.lib.common.operations.RemoteOperationResult
import com.educamadrid.cloudeduca.lib.resources.shares.GetRemoteShareesOperation
import com.educamadrid.cloudeduca.lib.resources.shares.responses.ShareeOcsResponse
import com.educamadrid.cloudeduca.lib.resources.shares.services.ShareeService

class OCShareeService(override val client: OwnCloudClient) :
    ShareeService {
    override fun getSharees(
        searchString: String,
        page: Int,
        perPage: Int
    ): RemoteOperationResult<ShareeOcsResponse> =
        GetRemoteShareesOperation(
            searchString,
            page,
            perPage
        ).execute(client)
}
