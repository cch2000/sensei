package com.sensei.search.client.json.req.filter;

import java.util.ArrayList;
import java.util.List;

import com.sensei.search.client.json.req.Operator;

public interface Filter {
    
    /**
     *    <p>A filter that matches documents using <code>AND</code> or <code>OR</code> boolean operator on other queries. This filter is more performant then <a href="bool-filter.html">bool</a> filter. Can be placed within queries that accept a filter.</p>
<pre class="prettyprint lang-js"><span class="pun">{</span><span class="pln"><br>&nbsp; &nbsp; </span><span class="str">"filtered"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">{</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"query"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">{</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"term"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">{</span><span class="pln"> </span><span class="str">"name.first"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="str">"shay"</span><span class="pln"> </span><span class="pun">}</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">},</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"filter"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">{</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"and"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">[</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">{</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"range"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">{</span><span class="pln"> <br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"postDate"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">{</span><span class="pln"> <br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"from"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="str">"2010-03-01"</span><span class="pun">,</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"to"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="str">"2010-04-01"</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">}</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">}</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">},</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">{</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="str">"prefix"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="pun">{</span><span class="pln"> </span><span class="str">"name.second"</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="str">"ba"</span><span class="pln"> </span><span class="pun">}</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">}</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">]</span><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="pun">}</span><span class="pln"><br>&nbsp; &nbsp; </span><span class="pun">}</span><span class="pln"><br></span><span class="pun">}</span></pre>


     *
     */
    public static class AndOr implements Filter {
         List<Filter> filters = new ArrayList<Filter>();;
         Operator operation;
        public AndOr(List<Filter> filters, Operator operation) {
            super();
            this.filters = filters;
            this.operation = operation;
        }
        public List<Filter> getFilters() {
            return filters;
        }
        public Operator getOperation() {
            return operation;
        }
        
         
         
    }
}
