/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2021 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2021 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.nephron.testing.flowgen;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.opennms.nephron.elastic.IndexStrategy;

public interface EsRawFlowBulkReqGenOptions extends FlowGenOptions {

    @Description("Elasticsearch Raw Flow Index")
    @Default.String("netflow")
    String getEsRawFlowIndex();
    void setEsRawFlowIndex(String value);

    @Description("Elasticsearch Index Strategy")
    @Default.Enum("HOURLY")
    IndexStrategy getEsRawFlowIndexStrategy();
    void setEsRawFlowIndexStrategy(IndexStrategy value);

    @Description("Bulk request batch size")
    @Default.Integer(1000)
    int getEsRawFlowBatchSize();
    void setEsRawFlowBatchSize(int value);

    @Description("Determines where the bulk requests are output")
    @Default.Enum("FILE")
    Output getEsRawFlowOutput();
    void setEsRawFlowOutput(Output value);

    @Description("Determines if the timestamps of the generated flows end at the current time. Overrides the startMs argument.")
    @Default.Boolean(true)
    boolean getEsRawFlowEndAtNow();
    void setEsRawFlowEndAtNow(boolean value);

    enum Output {
        ELASTIC_SEARCH, FILE
    }

}