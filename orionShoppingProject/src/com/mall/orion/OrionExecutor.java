package com.mall.orion;

import com.mall.orion.adidas.AdidasImpl;
import com.mall.orion.appleImpl.AppleImpl;
import com.mall.orion.bataImpl.BataImpl;
import com.mall.orion.ccdImpl.CCDImpl;
import com.mall.orion.cromaImpl.CromaImpl;
import com.mall.orion.dominosImpl.DominosImpl;
import com.mall.orion.hamleysImpl.HamleysImpl;
import com.mall.orion.hm.HMImpl;
import com.mall.orion.kfcImpl.KFCImpl;
import com.mall.orion.landMarkImpl.LandmarkImpl;
import com.mall.orion.levisImpl.LevisImpl;
import com.mall.orion.lifeStyleImpl.LifestyleImpl;
import com.mall.orion.maxImpl.MaxImpl;
import com.mall.orion.mcdonaldsImpl.McDonaldsImpl;
import com.mall.orion.metroImpl.MetroImpl;
import com.mall.orion.nike.NikeImpl;
import com.mall.orion.orionRules.OrionRules;
import com.mall.orion.pizzaHutImpl.PizzaHutImpl;
import com.mall.orion.rebok.ReebokImpl;
import com.mall.orion.relianceDigitalImpl.RelianceDigitalImpl;
import com.mall.orion.samsungImpl.SamsungImpl;
import com.mall.orion.shoppersStopImpl.ShoppersStopImpl;
import com.mall.orion.starBUcksImpl.StarbucksImpl;
import com.mall.orion.subwayImpl.SubwayImpl;
import com.mall.orion.tacoBellImpl.TacoBellImpl;
import com.mall.orion.tanishqImpl.TanishqImpl;
import com.mall.orion.titanImpl.TitanImpl;
import com.mall.orion.uniqlo.UNIQLOImpl;
import com.mall.orion.westsideImpl.WestsideImpl;
import com.mall.orion.zara.ZaraImpl;

public class OrionExecutor {

    public static void main(String[] args) {

        OrionRules rulesA = new AdidasImpl();
        rulesA.doBusiness();

        OrionRules rulesB = new AppleImpl();
        rulesB.doBusiness();

        OrionRules rulesC = new BataImpl();
        rulesC.doBusiness();

        OrionRules rulesD = new CCDImpl();
        rulesD.doBusiness();

        OrionRules rulesE = new CromaImpl();
        rulesE.doBusiness();

        OrionRules rulesF = new DominosImpl();
        rulesF.doBusiness();

        OrionRules rulesG = new HamleysImpl();
        rulesG.doBusiness();

        OrionRules rulesH = new HMImpl();
        rulesH.doBusiness();

        OrionRules rulesI = new KFCImpl();
        rulesI.doBusiness();

        OrionRules rulesJ = new LandmarkImpl();
        rulesJ.doBusiness();

        OrionRules rulesK = new LevisImpl();
        rulesK.doBusiness();

        OrionRules rulesL = new LifestyleImpl();
        rulesL.doBusiness();

        OrionRules rulesM = new MaxImpl();
        rulesM.doBusiness();

        OrionRules rulesN = new McDonaldsImpl();
        rulesN.doBusiness();

        OrionRules rulesO = new MetroImpl();
        rulesO.doBusiness();

        OrionRules rulesP = new NikeImpl();
        rulesP.doBusiness();

        OrionRules rulesQ = new PizzaHutImpl();
        rulesQ.doBusiness();
        
        OrionRules rulesS = new ReebokImpl();
        rulesS.doBusiness();

        OrionRules rulesT = new RelianceDigitalImpl();
        rulesT.doBusiness();

        OrionRules rulesU = new SamsungImpl();
        rulesU.doBusiness();

        OrionRules rulesV = new ShoppersStopImpl();
        rulesV.doBusiness();

        OrionRules rulesW = new StarbucksImpl();
        rulesW.doBusiness();

        OrionRules rulesX = new SubwayImpl();
        rulesX.doBusiness();

        OrionRules rulesY = new TacoBellImpl();
        rulesY.doBusiness();

        OrionRules rulesZ = new TanishqImpl();
        rulesZ.doBusiness();

        OrionRules rulesAA = new TitanImpl();
        rulesAA.doBusiness();

        OrionRules rulesAB = new UNIQLOImpl();
        rulesAB.doBusiness();

        OrionRules rulesAC = new WestsideImpl();
        rulesAC.doBusiness();

        OrionRules rulesAD = new ZaraImpl();
        rulesAD.doBusiness();
    }
}