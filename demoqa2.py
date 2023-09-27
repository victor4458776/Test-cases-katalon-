#XPATH CHECKER & SELECTORS 
#Url is https://demoqa.com/text-box
#I click the button 2 times but the page does not reponds
@FindBy(how = How.XPATH, using="(//button[@type='button'])[2]")

class:
//div[contains(@class,'text-right col-md-2')]//button[1]

2.Inspect-css elements *t=yes *t=no
xpath and css are working well
//*[@id="app"]/div/div/div[2]/div[2]/div[2] (yes)
#userEmail-wrapper (yes)
#currentAddress-wrapper (yes)
Passed-boxes

3.Record-code
import url from 'url';
import { createRunner } from '@puppeteer/replay';

export async function run(extension) {
    const runner = await createRunner(extension);

    await runner.runBeforeAllSteps();

    await runner.runStep({
        type: 'setViewport',
        assertedEvents: [
            {
                type: 'navigation',
                url: 'https://demoqa.com/text-box',
                title: 'Title'
            }
        ],
        width: 1097,
        height: 287,
        deviceScaleFactor: 1,
        isMobile: false,
        hasTouch: false,
        isLandscape: false
    });
    await runner.runStep({
        type: 'navigate',
        url: 'https://demoqa.com/text-box',
        assertedEvents: [
            {
                type: 'navigation',
                url: 'https://demoqa.com/text-box',
                title: 'DEMOQA'
            }
        ]
    });

    await runner.runAfterAllSteps();
}

if (process && import.meta.url === url.pathToFileURL(process.argv[1]).href) {
    run()
}
