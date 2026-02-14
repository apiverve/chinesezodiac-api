using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.ChineseZodiac
{
    /// <summary>
    /// Query options for the Chinese Zodiac API
    /// </summary>
    public class ChineseZodiacQueryOptions
    {
        /// <summary>
        /// The date in YYYY-MM-DD format (years 1900-2100)
        /// </summary>
        [JsonProperty("date")]
        public string Date { get; set; }
    }
}
