declare module '@apiverve/chinesezodiac' {
  export interface chinesezodiacOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface chinesezodiacResponse {
    status: string;
    error: string | null;
    data: ChineseZodiacData;
    code?: number;
  }


  interface ChineseZodiacData {
      date:                    Date;
      zodiacYear:              number;
      animal:                  string;
      animalChinese:           string;
      element:                 string;
      elementChinese:          string;
      elementColor:            string;
      polarity:                string;
      traits:                  string[];
      sexagenaryCyclePosition: number;
      fullName:                string;
      chineseNewYear:          Date;
  }

  export default class chinesezodiacWrapper {
    constructor(options: chinesezodiacOptions);

    execute(callback: (error: any, data: chinesezodiacResponse | null) => void): Promise<chinesezodiacResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: chinesezodiacResponse | null) => void): Promise<chinesezodiacResponse>;
    execute(query?: Record<string, any>): Promise<chinesezodiacResponse>;
  }
}
