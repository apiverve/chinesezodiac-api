declare module '@apiverve/chinesezodiac' {
  export interface chinesezodiacOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface chinesezodiacResponse {
    status: string;
    error: string | null;
    data: ChineseZodiacData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface ChineseZodiacData {
      date:                    Date | null;
      zodiacYear:              number | null;
      animal:                  null | string;
      animalChinese:           null | string;
      element:                 null | string;
      elementChinese:          null | string;
      elementColor:            null | string;
      polarity:                null | string;
      traits:                  (null | string)[];
      sexagenaryCyclePosition: number | null;
      fullName:                null | string;
      chineseNewYear:          Date | null;
  }

  export default class chinesezodiacWrapper {
    constructor(options: chinesezodiacOptions);

    execute(callback: (error: any, data: chinesezodiacResponse | null) => void): Promise<chinesezodiacResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: chinesezodiacResponse | null) => void): Promise<chinesezodiacResponse>;
    execute(query?: Record<string, any>): Promise<chinesezodiacResponse>;
  }
}
