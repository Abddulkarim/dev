/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author Kodssi
 */
class CTimer {

    public:
        Timer(uint16_t duration);
        ~Timer();
        void Runtime();
        bool IsFinished() { return timeout; };
    private:
        bool timeout{};
        uint16_t duration{};
        long previousMillis{};
};

CTimer::Timer(uint16_t duration)
{
    duration = duration;
    previousMillis = millis();
}

CTimer::Runtime()
{
    if(millis() >= (previousMillis+(long)duration))
    {
        previousMillis = millis();
        timeout = true;        
    }
    else
    {
        timeout = false;
    }
}


CTimer *Timer1 = new CTimer(1000);
CTimer *Timer2 = new CTimer(1500);
CTimer *Timer3 = new CTimer(2000);


void loop()
{
    Timer1->Runtime();
    Timer2->Runtime();
    Timer3->Runtime();

    if(Timer1->IsFinished())
    {
        //...
    }

    if(Timer2->IsFinished())
    {
        //...
        ///digitawrite(3,Timer1->IsFinished())
    }

    if(Timer3->IsFinished())
    {
        //...
    }


}

    
}
