/*
 * Copyright (c) 2021. Increff
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.nextscm.commons.template.form;

import java.util.Date;
import java.util.List;

public class ManifestForm extends AbstractForm {

	private String manifestId;
	private String transporter;
	private Date manifestTime;
	private String channelId;
	private String channelManifestId;

	private List<ManifestLineItem> lineItems;

	public String getManifestId() {
		return manifestId;
	}

	public void setManifestId(String manifestId) {
		this.manifestId = manifestId;
	}

	public String getTransporter() {
		return transporter;
	}

	public void setTransporter(String courier) {
		this.transporter = courier;
	}

	public Date getManifestTime() {
		return manifestTime;
	}

	public void setManifestTime(Date manifestTime) {
		this.manifestTime = manifestTime;
	}

	public List<ManifestLineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<ManifestLineItem> manifestLineItem) {
		this.lineItems = manifestLineItem;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelManifestId() {
		return channelManifestId;
	}

	public void setChannelManifestId(String channelManifestId) {
		this.channelManifestId = channelManifestId;
	}

}
